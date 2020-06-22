package basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) {
		// path
		Path path = Paths.get("c:/program files");
		try {
			Stream<Path> stream = Files.list(path);
//			stream.forEach((t) -> System.out.println(t.getFileName()));
//			stream.forEach(new Consumer<Path>() {
//				@Override
//				public void accept(Path t) {
//					System.out.println(t.getFileName());
//				}
//			});
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//file ==>경로에 지정한 파일의 내용을 읽어오는 내용.
		path = Paths.get("src/basic/FromDirectoryExample.java");
		path = Paths.get(".project"); //StreamProject 하위.. root 디렉토리.
		//path = Paths.get("src/listData.txt"); //오류나네.
		try {
			Stream<String> strStream = Files.lines(path);
			strStream.forEach(t -> System.out.println(t.toString()));
			strStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//end of main
}//end of FromDirectoryExample