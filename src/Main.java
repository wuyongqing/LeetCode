import problems.Problems;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long start, end;
        Problems problems = new Problems();

        start=System.currentTimeMillis();
        System.out.println(problems.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));
        end=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end-start)+"ms");

        start=System.currentTimeMillis();
        System.out.println(problems.wordBreak1("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));
        end=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end-start)+"ms");

        start=System.currentTimeMillis();
        System.out.println(problems.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                Arrays.asList("aa", "aaaaaa", "aaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "ab", "aab")).size());
        end=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end-start)+"ms");

        start=System.currentTimeMillis();
        System.out.println(problems.wordBreak1("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                Arrays.asList("aa", "aaaaaa", "aaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "ab", "aab")).size());
        end=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end-start)+"ms");
    }
}
