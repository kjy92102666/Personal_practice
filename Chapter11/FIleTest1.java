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
	
	//FileŬ������ �޼ҵ� ����ϱ�
	public static void main(String[] args) {
		System.out.println("c: ����̺��� ��ü ���� ���");
		File file = new File("C:\\");
		String[] files = file.list();
		
		for(String fileName : files) {
			File subFile = new File(file,fileName);
			if(file.isDirectory()) {
				System.out.println("���͸� �̸� : " + fileName);
			}else {
				System.out.println("���� �̸� : " + fileName + "���� ũ�� : " + subFile.length() + "byte");
			}
		}
		
		System.out.println("c:����̺��� �̹��� ���ϸ� ���");
		String[] imageFiles = file.list(new ImageNameFilter());
		
		for(String fileName:imageFiles) {
			File subFile = new File(file, fileName);
			System.out.println("���� �̸� : " + fileName + "���� ũ�� : " + subFile.length() + ", byte" 
			+ ", ���� ��� : " +subFile.getAbsolutePath());
		}
		
		File makeFile = new File("c:\\data\\testFile.txt");
		try {
			makeFile.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		if(makeFile.exists()) {
			System.out.println("makeFile�� ������.");
		}
		
		File renameFile = new File("c:\\data\\testFile2.txt");
		makeFile.renameTo(renameFile);
		
		if(renameFile.exists()) {
			System.out.println("makeFile�� �̸��� �����.");
		}
		
		if(renameFile.delete()) {
			System.out.println("renameFile�� ���ŵ�.");
		}
	}
	
}
