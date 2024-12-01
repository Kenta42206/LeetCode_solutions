import java.util.Stack;

class Leetcode682 {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String operation : operations) {

            switch (operation) {
                case "C" -> stack.pop();
                case "D" -> {
                    int doubleNum = stack.peek() * 2;
                    stack.add(doubleNum);
                }
                case "+" -> {
                    int addNum = stack.peek() + stack.get(stack.size() - 2);
                    stack.add(addNum);
                }
                default -> {
                    stack.add(Integer.valueOf(operation));
                }
            }
        }

        int total = 0;
        while(!stack.isEmpty()){
            total += stack.pop();
        }
        return total;
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}