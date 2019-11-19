
//package com.thp.spring.projetfinal.controller;
//
//import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.security.test.context.support.WithMockUser;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.thp.spring.projetfinal.dto.MissionDTO;
//import com.thp.spring.projetfinal.entities.MissionEntity;
//import com.thp.spring.projetfinal.service.MissionService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//@ActiveProfiles("test")
//public class MissionControllerTest {
//
//	
//	
//	@MockBean
//	private MissionService missionService;
//	@Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	WebApplicationContext webApplicationContext;
//	
//	@BeforeEach
//	 protected void setUp() {
//		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).apply(springSecurity()).build();
//	   }
//	


//
//	@WithMockUser(roles="ADMIN")
//	@Test
//	void testFindAllMission() throws Exception {
//		this.mockMvc.perform(get("/mission")).andExpect(status().isOk());
//	}
//
//	@WithMockUser(roles="ADMIN")
//	@Test
//	void testGetMission() throws Exception {
//		this.mockMvc.perform(get("/mission?id=1")).andExpect(status().isOk());
//	}
//
//	@WithMockUser(roles="ADMIN")
//	@Test
//	void testGetByClient() throws Exception {
//		this.mockMvc.perform(get("/mission/talan")).andExpect(status().isOk());	
//	}
//
//	
//	@WithMockUser(roles="ADMIN")
//	@Test
//	void testDeletemission() throws Exception {
//		this.mockMvc.perform(delete("/mission/1")).andExpect(status().isOk());
//	}
//
//	public static String asJsonString(final Object obj) {
//		try {
//			final ObjectMapper mapper = new ObjectMapper();
//			final String jsonContent = mapper.writeValueAsString(obj);
//			return jsonContent;
//		} catch (Exception e) { 
//			throw new RuntimeException(e); 
//		}
//	}
//	
//	
//	
//	
//}

