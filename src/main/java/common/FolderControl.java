package common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FolderControl {

	/**
	 * ファイル移動
	 * @param filePath：コピー元ファイルパス
	 * @param moveDirevtory：コピー先ディレクトリ
	 * @param moveFileName：コピーファイル名
	 * @throws IOException
	 */
	public static void inToInput(Path filePath, Path moveDirevtory, Path moveFileName) throws IOException {
		Files.move(filePath, Paths.get(moveDirevtory.toString(), moveFileName.toString()));
	}

	/**
	 * ファイル削除
	 * @param filePath：削除対象ファイルパス
	 * @throws IOException
	 */
	public static void deleteFile(Path filePath) throws IOException {
		Files.delete(filePath);
	}

	/**
	 * エラーファイルチェック
	 * @param fileName：対象ファイル名
	 * @param errorFileName：エラーファイル名
	 * @return
	 */
	public static boolean errXmlCheck(String fileName, String errorFileName) {
		if(fileName.contains(errorFileName)) {
			return false;
		}
		return true;
	}
}