package DemoEx.Socks;

import java.util.*;
import java.util.stream.Collectors;

public class Socks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> leftSocks = new ArrayDeque<>();
        ArrayDeque<Integer> rightSocks = new ArrayDeque<>();

        List<Integer> leftNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> rightNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> pair = new ArrayList<>();

        for (Integer left : leftNumbers) {
            leftSocks.push(left);
        }
        for (Integer right : rightNumbers) {
            rightSocks.offer(right);
        }

        //Това е същото като горното попълване
//        Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt).forEach(leftSocks::push);
//        Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt).forEach(rightSocks::offer);

        while (leftSocks.size() != 0 && rightSocks.size()  != 0) {
            int leftSock = leftSocks.peek();
            int rightSock = rightSocks.peek();

            if (leftSock > rightSock) {
                pair.add(leftSock + rightSock);
                leftSocks.pop();
                rightSocks.poll();
            } else if (leftSock < rightSock) {
                leftSocks.pop();
            } else {
                rightSocks.poll();
                int nextLeft = leftSocks.poll();
                leftSocks.push(nextLeft + 1);
            }
        }

        System.out.println(Collections.max(pair));
        for (Integer integer : pair) {
            System.out.print(integer + " ");
        }
    }
}
