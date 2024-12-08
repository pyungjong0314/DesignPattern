package Composite.File;

interface Node {
    // 계층 트리 출력
    void print();
    void print(String str);

    // 파일/폴더 용량 얻기
    int getSize();
}
