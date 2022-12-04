package com.isfortech.examen;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.isfortech.Models.LoginModel;
import com.isfortech.Repositories.LoginRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class ExamenApplicationTests {
	@Autowired
	private LoginRepository loginRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void crearUsuarioTest() {
		LoginModel lg = new LoginModel();
		lg.setId(12);
		lg.setNombre("estuardo");
		lg.setClave(encoder.encode("123456"));
		LoginModel retorno  = loginRepository.save(lg);

		assertTrue(retorno.getClave().equalsIgnoreCase(lg.getClave()));
	}

}
