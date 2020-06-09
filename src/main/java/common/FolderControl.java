package common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FolderControl {

	private Path inDir, outputDir;

	public FolderControl(Path inDir, Path outputDir) {
		this.inDir = inDir;
		this.outputDir = outputDir;
	}

	/**
	 * INフォルダへのファイル移動
	 * @param filePath
	 * @param destFileName
	 * @throws IOException
	 */
	public void moveFileIn(Path filePath, Path destFileName){
		try {
			Files.move(filePath, inDir.resolve(destFileName));
		} catch (IOException e) {
			System.out.println(destFileName + "のファイル移動に失敗しました。同名ファイルが存在している可能性があります。");
		}
	}

	/**
	 * Outputフォルダへのファイル移動
	 * @param filePath
	 * @param destFileName
	 * @throws IOException
	 */
	public void moveFileOutput(Path filePath, Path destFileName){
		try {
			Files.move(filePath, outputDir.resolve(destFileName));
		} catch (IOException e) {
			System.out.println(destFileName + "のファイル移動に失敗しました。同名ファイルが存在している可能性があります。");
		}
	}


	/**
	 * ファイル削除
	 * @param filePath：削除対象ファイルパス
	 * @throws IOException
	 */
	public void deleteFile(Path filePath){
		try {
			Files.delete(filePath);
		} catch (IOException e) {
			System.out.println(filePath + "の削除に失敗しました。");
		}
	}

	/**
	 * エラーファイルチェック
	 * @param fileName：対象ファイル名
	 * @param errorFileName：エラーファイル名
	 * @return
	 */
	public boolean errXmlJudge(String fileName, String errorFileName) {
		if(fileName.endsWith(errorFileName) && fileName.length() > errorFileName.length()) {
			return true;
		}
		return false;
	}
}