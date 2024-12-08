package Iterator.Board;

import java.time.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 1. 게시판 생성
        Board board = new Board();

        // 2. 게시판에 게시글을 포스팅
        board.addPost("디자인 패턴 과제", LocalDate.of(2024, 8, 30));
        board.addPost("강평종", LocalDate.of(2024, 2, 6));
        board.addPost("프로그래밍 언어", LocalDate.of(2024, 6, 1));
        board.addPost("이터레이터 패턴", LocalDate.of(2024, 12, 22));

        List<Post> posts = board.getPosts();

        // 3. 게시글 발행 순서대로 조회하기
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.title + " / " + post.date);
        }

        System.out.println();

        // 4. 게시글 날짜별로 조회하기
        Collections.sort(posts, (p1, p2) -> p1.date.compareTo(p2.date)); // 집합체를 날짜별로 정렬
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.title + " / " + post.date);
        }
    }
}
