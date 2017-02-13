package sample.batch.step;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

import sample.batch.exception.BatchSkipException;

@Component("itemReader")
public class EntryItemReader implements ItemReader<String> {

	private String[] input = {"Hello World", "hoge", "hoge", "こんにちわ。世界", null};

	private int index = 0;

	/**
	 * Reads next record from input
	 */
	public String read() throws Exception {

		String message = input[index++];

		// NULL返却で、読み込みデータが存在しない為、ジョブ終了
		if(message == null) {
			return null;
		}
		if (message.equals("hoge")) {

			// 例外発生で、ジョブ終了
			throw new BatchSkipException("不正なデータです"
					+ message + "]");
		}
		return message;
	}
}
