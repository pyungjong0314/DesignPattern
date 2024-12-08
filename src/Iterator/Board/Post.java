package Iterator.Board;

import java.time.LocalDate;
import java.util.*;

// 게시글
class Post {
    String title; // 게시글 제목
    LocalDate date; // 게시글 발행일

    public Post(String title, LocalDate date) {
        this.title = title;
        this.date = date;
    }
}

// 게시판
class Board {
    // 게시글을 리스트 집합 객체로 저장 관리
    List<Post> posts = new ArrayList<>();

    public void addPost(String title, LocalDate date) {
        this.posts.add(new Post(title, date));
    }

    public List<Post> getPosts() {
        return posts;
    }
}