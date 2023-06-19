//package Lesson4;
//
//import java.util.Stack;
//
//public class Lesson4_Ex006_Stack {
//    public static void main(String[] args) {
//        var exp = "1 2 3 * +".split(" ");//здесь записано выражение 1 + 2 * 3
//        int res = 0;
//        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i < exp.length; i++) {
//
//            if (isDigit(exp[i])) {
//                st.push(Integer.parseInt(exp[i]));
//            } else {
//                switch (exp[i]) {
//                    case"+":
//                        res = st.pop() + st.pop();
//                        st.push(res);
//                        break;
//                    case "-":
//                        res=-st.pop()+st.pop();
//                        st.push(res);
//                        break;
//                    case "*":
//                        res=st.pop()* st.pop();
//                        st.push(res);
//                        break;
//                    case "/":
//                        res=st.pop()/ st.pop();
//                        st.push(res);
//                        break;
//                }
//            }
//        }
//        System.out.printf("%d\n",st.pop());
//    }
//}
