package com.example.testeIntegrador;

import com.example.testeIntegrador.controller.LinguagemController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)//você precisa dessa anotação apenas para habilitar os recursos do spring boot
	//como por exemplo @Autowired, @MockBean, durante os testes
@WebMvcTest(LinguagemController.class)//estou indicando de onde iremos começar o nosso teste
class TesteIntegradorApplicationTests {

	@Autowired
	private MockMvc mockMvc;//este recurso vai nos permitir que nós possamos acessar a URL

	@Test
	void buscarTodasLinguagensAPI() throws Exception{
		//agora vamos construir nossa consulta e algum tipo de validação
		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens")
				.accept(MediaType.APPLICATION_JSON))//estou indicando que ele irá aceitar arquivos do tipo JSON
				.andDo(MockMvcResultHandlers.print())//vai printar no console as informações advindas deste comando
				.andExpect(MockMvcResultMatchers.status().isOk());//aqui eu indico o que ele espera
	}

	@Test
	void buscarLinguagemPorTipoAPI() throws Exception{
		//agora vamos construir nossa consulta e algum tipo de validação
		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens/{tipo}","Java")
						.accept(MediaType.APPLICATION_JSON))//estou indicando que ele irá aceitar arquivos do tipo JSON
				.andDo(MockMvcResultHandlers.print())//vai printar no console as informações advindas deste comando
				.andExpect(MockMvcResultMatchers.status().isOk());//aqui eu indico o que ele espera
	}

	@Test
	void buscarLinguagensNaoExistentesPorTipoAPI() throws Exception{
		//agora vamos construir nossa consulta e algum tipo de validação
		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens/{tipo}","JavaScript")
						.accept(MediaType.APPLICATION_JSON))//estou indicando que ele irá aceitar arquivos do tipo JSON
				.andDo(MockMvcResultHandlers.print())//vai printar no console as informações advindas deste comando
				.andExpect(MockMvcResultMatchers.status().isNotFound());//aqui eu indico o que ele espera
	}

	@Test
	void contextLoads() {
	}

}
