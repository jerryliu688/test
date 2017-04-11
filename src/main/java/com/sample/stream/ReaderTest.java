package com.sample.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

import com.sun.corba.se.spi.ior.Writeable;

public class ReaderTest {

	public static void main(String[] args) {

		write();
	}

	public static void read() {
		String filePath = "resources/test.txt";
		// Path path = Paths.get("~/test/", "foo", "bar", "a.txt");
		File file = new File(filePath);
		List<String> tempList = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
			// BufferedReader read = new BufferedReader(new FileReader(new
			// File(filename)));
			// BufferedReader read = new BufferedReader(new
			// FileReader(filepath));
			String line = null;

			while ((line = br.readLine()) != null) {
				if (!StringUtils.isBlank(line)) {
					tempList.add(line);
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(tempList);
	}

	public static void write() {
		String filePath = "resources/test_write.txt";//C:\Jerry\Project\workspace\test
		FileOutputStream writerStream = null;
		try {
//			writerStream = new FileOutputStream(filePath);
//			BufferedWriter oWriter = new BufferedWriter(new OutputStreamWriter(writerStream,"UTF-8"));
//			// FileWriter fw = new FileWriter("D:\\love.txt");
//			// BufferedWriter bufw = new BufferedWriter(fw);
//			oWriter.write("a");
//			oWriter.write(System.getProperty("line.separator"));
//			oWriter.write("b");
//			oWriter.newLine();
//			oWriter.flush();
//			oWriter.close();
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath),"utf-8")));
			out.println("aa");
			out.println("");
			out.println("bb");
			out.flush();
			out.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
