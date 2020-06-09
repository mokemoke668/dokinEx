package common;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SettingFolders {

	private String inDirectory;      //INフォルダパス
	private String outDirectory;     //OUTフォルダパス
	private String inputDirectory;   //INPUTフォルダパス
	private String outputDirectory;  //OUTPUTフォルダパス

	public Path getInDirectoryPath() {
		return Paths.get(inDirectory);
	}

	public Path getOutDirectoryPath() {
		return Paths.get(outDirectory);
	}

	public Path getInputDirectoryPath() {
		return Paths.get(inputDirectory);
	}

	public Path getOutputDirectoryPath() {
		return Paths.get(outputDirectory);
	}

	public String getInDirectory() {
		return inDirectory;
	}

	public String getOutDirectory() {
		return outDirectory;
	}

	public String getInputDirectory() {
		return inputDirectory;
	}

	public String getOutputDirectory() {
		return outputDirectory;
	}

	public void setInDirectory(String inDirectory) {
		this.inDirectory = inDirectory;
	}

	public void setOutDirectory(String outDirectory) {
		this.outDirectory = outDirectory;
	}

	public void setInputDirectory(String inputDirectory) {
		this.inputDirectory = inputDirectory;
	}

	public void setOutputDirectory(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}

	/**
	 * 各フォルダパスの設定状況を確認する（nullもしくは空の場合false)
	 * @return
	 */
	public boolean directoryPathJudge(){

		if (isNullOrEmpty(inDirectory) || isNullOrEmpty(outDirectory) || isNullOrEmpty(inputDirectory)
				|| isNullOrEmpty(outputDirectory)) {
			return false;
		}

		return true;
	}

	/**
	 * 文字が空文字もしくはNULLでないかを判定する。
	 * @param str
	 * @return
	 */
	private boolean isNullOrEmpty(String str) {
		return str == null || str.isEmpty();
	}

}
