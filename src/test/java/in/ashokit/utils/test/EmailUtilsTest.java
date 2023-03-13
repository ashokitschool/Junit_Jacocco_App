package in.ashokit.utils.test;

import static org.mockito.Mockito.doNothing;

import javax.mail.internet.MimeMessage;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mail.javamail.JavaMailSender;

import in.ashokit.util.EmailUtils;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class EmailUtilsTest {

	@MockBean
	private JavaMailSender mailSender;

	@InjectMocks
	private EmailUtils emailUtils;

	public void sendMailTest() {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		doNothing().when(mailSender).send(mimeMessage);
		emailUtils.sendEmail("test-subject", "test-body", "test@gmail.com");
	}
}
