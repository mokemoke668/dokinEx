package yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.yaml.snakeyaml.Yaml;

import common.SettingFolders;

public class YamlControl {

	private Path readPath;

	/**
	 * コンストラクタ
	 * @param path
	 */
	public YamlControl(Path path) {
		this.readPath = path;
	}

	/**
	 * YAMLファイル読み込み
	 * @return
	 * @throws IOException
	 */
	public SettingFolders yamlRead() throws IOException {

		SettingFolders folder = new SettingFolders();

		if(pathExistsJudge()) {

			Yaml yaml = new Yaml();
			try (InputStream in = Files.newInputStream(readPath)) {
				folder = yaml.loadAs(in, SettingFolders.class);
			}
		}

		return folder;
	}

	/**
	 * Pathの存在チェック（ture:存在、false：存在していない）
	 * @return
	 */
	private boolean pathExistsJudge(){
		return Files.exists(readPath);
	}
}