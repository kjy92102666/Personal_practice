package Chapter11;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FIleTest1 {
	public static class ImageNameFilter implements FilenameFilter{
		@Override
		public boolean accept(File dir, String name) {
			return name.endsWith(".jpg");
		}
	}
	
	//File클래스의 메소드 사용하기
	public static void main(String[] args) {
		System.out.println("c: 드라이브의 전체 파일 출력");
		File file = new File("C:\\");
		String[] files = file.list();
		
		for(String fileName : files) {
			File subFile = new File(file,fileName);
			if(file.isDirectory()) {
				System.out.println("디렉터리 이름 : " + fileName);
			}else {
				System.out.println("파일 이름 : " + fileName + "파일 크기 : " + subFile.length() + "byte");
			}
		}
		
		System.out.println("c:드라이브의 이미지 파일만 출력");
		String[] imageFiles = file.list(new ImageNameFilter());
		
		for(String fileName:imageFiles) {
			File subFile = new File(file, fileName);
			System.out.println("파일 이름 : " + fileName + "파일 크기 : " + subFile.length() + ", byte" 
			+ ", 파일 경로 : " +subFile.getAbsolutePath());
		}
		
		File makeFile = new File("c:\\data\\testFile.txt");
		try {
			makeFile.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		if(makeFile.exists()) {
			System.out.println("makeFile이 생성됨.");
		}
		
		File renameFile = new File("c:\\data\\testFile2.txt");
		makeFile.renameTo(renameFile);
		
		if(renameFile.exists()) {
			System.out.println("makeFile의 이름이 변경됨.");
		}
		
		if(renameFile.delete()) {
			System.out.println("renameFile이 제거됨.");
		}
	}
	
}
