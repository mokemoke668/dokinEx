package yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.yaml.snakeyaml.Yaml;

import common.Folder;

public class YamlControl {

	// yamlファイル読み込み
	public static Folder yamlRead(String path) throws IOException {

		Yaml yaml = new Yaml();

    	try(InputStream in = Files.newInputStream(Paths.get(path))) {
    		Folder folder = yaml.loadAs(in, Folder.class);
        	return folder;
		}
	}
}