import java.util.*;

public class Main {
    public static HashMap<String, List<Equation>> map = new HashMap<>();
    public static void main(String[] args) {
        List<List<String>> equations = new ArrayList<>();
        double[] values = new double[6];
        List<List<String>> queries = new ArrayList<>();

        equations.add(new ArrayList<String>(Arrays.asList("x1", "x2")));
        equations.add(new ArrayList<String>(Arrays.asList("x2", "x3")));
        equations.add(new ArrayList<String>(Arrays.asList("x3", "x4")));
        equations.add(new ArrayList<String>(Arrays.asList("x4", "x5")));

        queries.add(new ArrayList<String>(Arrays.asList("x2", "x4")));
       //  queries.add(new ArrayList<String>(Arrays.asList("x2", "b")));
        values[0] = 3;
        values[1] = 4;
        values[2] = 5.0;
        values[3] = 6.0;

//        double result = calcEquation(equations, values, )
        double[] result = calcEquation(equations, values, queries);
        System.out.println(result[0]);
    }
    public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        map.clear();
        double[] result = new double[queries.size()];

        // adding equations into map
        for (int i = 0; i < equations.size(); i++) {
            List<String> temp = equations.get(i);
            String str1 = temp.get(0);
            String str2 = temp.get(1);

            if (map.containsKey(str1)) {
                map.get(str1).add(new Equation(str2, values[i]));
            } else {
                List<Equation> equationList = new ArrayList<>();
                equationList.add(new Equation(str2, values[i]));
                map.put(str1, equationList);
            }

            if (map.containsKey(str2)) {
                map.get(str2).add(new Equation(str1, (1 / values[i])));
            } else {
                List<Equation> equationList = new ArrayList<>();
                equationList.add(new Equation(str1, (1 / values[i])));
                map.put(str2, equationList);
            }
        }

        // calculating queries & adding new equations into map
        for (int i = 0; i < queries.size(); i++) {
            String str1 = queries.get(i).get(0);
            String str2 = queries.get(i).get(1);

            if (!map.containsKey(str1) || !map.containsKey(str2)) {
                result[i] = -1.0;
            } else {
                Queue<Equation> q = new LinkedList<Equation>();
                List<String> checked = new ArrayList<>();
                checked.add(str1);
                for (Equation each : map.get(str1)) {
                    q.add(each);
                    if (each.var.equals(str2)) {
                        result[i] = each.num;
                    }
                }
                if (result[i] == 0) {
                    result[i] = bfs(str1, str2);
                }
            }
        }
        return result;
    }

    public static double bfs(String str1, String str2) {
        Queue<Equation> queue = new LinkedList<>();
        List<String> checked = new ArrayList<>();

        queue.add(new Equation(str1, 1.0));
        checked.add(str1);

        double result = 0;

        while (!queue.isEmpty()) {
            Equation curr = queue.peek();
            List<Equation> equationList = map.get(curr.var);
            for (Equation eq: equationList) {
                if (eq.var.equals(str2)) {
                    result = curr.num * eq.num;
                } else {
                    if (!checked.contains(eq.var)) {
                        queue.add(new Equation(eq.var, curr.num * eq.num));
                        checked.add(eq.var);
                    }
                }

            }
            queue.remove();
        }
        return result;
    }

//    public static double bfs(String str2, Queue<Equation> q, List<String> checked) {
//        Equation temp = q.peek();
//        for (Equation eq : map.get(temp.getVar())) {
//            if (eq.var.equals(str2)) {
//                return temp.num * eq.num;
//            } else {
//                if (!checked.contains(eq.var)) {
//                    q.add(eq);
//                }
//            }
//        }
//        checked.add(q.remove().getVar());
//        return temp.num * bfs(str2, q, checked);
//    }

    public static class Equation {
        public String var;
        public double num;

        public Equation(String var, double num) {
            this.var = var;
            this.num = num;
        }

        public String getVar() {
            return var;
        }
    }
}