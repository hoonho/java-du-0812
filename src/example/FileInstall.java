package example;

/*
 * spring 프로젝트 설치시 실행에 필요한
 * controller, service, repository, entity 등을
 * 자동으로 생성하는 프로그램
 */

public class FileInstall {
  public static void main(String[] args) {
    // 현재 디렉토리의 파일 목록을 출력
    java.io.File dir = new java.io.File(".");
    String[] files = dir.list();
    
    if (files != null) {
      for (String file : files) {
        System.out.println(file);
      }
    } else {
      System.out.println("디렉토리가 비어있거나 접근할 수 없습니다.");
    }

    // 추가적인 설치 작업을 여기에 구현할 수 있습니다.
    System.out.println("파일 설치 프로그램이 실행되었습니다.");
  }
}
