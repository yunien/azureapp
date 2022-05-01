package nick.example.demo.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import nick.example.demo.model.Todo;
import nick.example.demo.service.ITodoService;

@Component
public class Task {
	
	@Autowired
	ITodoService todoService;
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedDelay = 60000) // fixedDelay = 60000 表示當前方法執行完畢 60000ms(1分鐘) 後，Spring scheduling會再次呼叫該方法
	public void testFixDelay() {
		System.out.println("===fixedDelay: 時間:" + dateFormat.format(new Date()));
		Todo todo = new Todo(RandomStringUtils.randomAlphanumeric(10), RandomStringUtils.randomAlphanumeric(10));
		System.out.println("===fixedDelay: todo:" + todo.toString());
		todoService.createTodo(todo);
	}
	
}
