package desafiovet.servico.service;

import desafiovet.servico.entity.Servico;
import desafiovet.servico.repository.ServicoRepository;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


@ExtendWith(MockitoExtension.class)
class ServicoServiceTest {

    @Mock
    ServicoService servicoService;
    @Test
    void getServicosWhenEmpty() {
        //Arrange
        Mockito.doReturn(0).when(servicoService).getServicoSize();
        //Act
        servicoService.getServicoSize();
        //Assert
        Mockito.verify(servicoService,Mockito.times(1)).getServicoSize();
    }

    @Test
    void getServicosWhenNotEmpty() {
        //Arrange
        Servico exemplo = new Servico();
        Mockito.doReturn(1).when(servicoService).getServicoSize();
        Mockito.doNothing().when(servicoService).addNewServico(exemplo);
        //Act
        servicoService.addNewServico(exemplo);
        servicoService.getServicoSize();
        //Assert
        Mockito.verify(servicoService,Mockito.times(1)).addNewServico(exemplo);
        Mockito.verify(servicoService,Mockito.times(1)).getServicoSize();
    }

    @Test
    void addNewServico() {
        //Arrange
        Servico exemplo = new Servico();
        Mockito.doNothing().when(servicoService).addNewServico(exemplo);
        //Act
        servicoService.addNewServico(exemplo);
        //Assert
        Mockito.verify(servicoService,Mockito.times(1)).addNewServico(exemplo);
    }

    @Test
    void deleteServico() {
        //Arrange
        Mockito.doNothing().when(servicoService).deleteServico(1L);
        //Act
        servicoService.deleteServico(1L);
        //Assert
        Mockito.verify(servicoService,Mockito.times(1)).deleteServico(1L);
    }
}