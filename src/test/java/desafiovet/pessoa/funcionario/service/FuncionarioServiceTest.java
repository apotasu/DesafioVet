package desafiovet.pessoa.funcionario.service;

import desafiovet.pessoa.funcionario.entity.Funcionario;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class FuncionarioServiceTest {
    @Mock
    FuncionarioService funcionarioService;
    @Test
    void getFuncionariosWhenEmpty() {
        //Arrange
        Mockito.doReturn(0).when(funcionarioService).getFuncionariosSize();
        //Act
        funcionarioService.getFuncionariosSize();
        //Assert
        Mockito.verify(funcionarioService, Mockito.times(1)).getFuncionariosSize();
    }
    @Test
    void getFuncionariosWhenNotEmpty() {
        //Arrange
        Funcionario exemplo = new Funcionario();
        Mockito.doNothing().when(funcionarioService).addNewFuncionario(exemplo);
        Mockito.doReturn(1).when(funcionarioService).getFuncionariosSize();
        //Act
        funcionarioService.addNewFuncionario(exemplo);
        funcionarioService.getFuncionariosSize();
        //Assert
        Mockito.verify(funcionarioService,Mockito.times(1)).addNewFuncionario(exemplo);
        Mockito.verify(funcionarioService, Mockito.times(1)).getFuncionariosSize();
    }

    @Test
    void addNewFuncionario() {
        //Arrange
        Funcionario exemplo = new Funcionario();
        Mockito.doNothing().when(funcionarioService).addNewFuncionario(exemplo);
        //Act
        funcionarioService.addNewFuncionario(exemplo);
        //Assert
        Mockito.verify(funcionarioService,Mockito.times(1)).addNewFuncionario(exemplo);
    }

    @Test
    void deleteFuncionarioWhenValidIdProvided() {
        //Arrange
        Funcionario exemplo = new Funcionario();
        Mockito.doNothing().when(funcionarioService).addNewFuncionario(exemplo);
        Mockito.doNothing().when(funcionarioService).deleteFuncionario(1L);
        //Act
        funcionarioService.addNewFuncionario(exemplo);
        funcionarioService.deleteFuncionario(1L);
        //Assert
        Mockito.verify(funcionarioService,Mockito.times(1)).addNewFuncionario(exemplo);
        Mockito.verify(funcionarioService,Mockito.times(1)).deleteFuncionario(1L);
    }
    @Test
    void deleteFuncionarioWhenInvalidIdProvided() {
        //Arrange
        Funcionario exemplo = new Funcionario();
        Mockito.doNothing().when(funcionarioService).deleteFuncionario(1L);
        //Act
        funcionarioService.deleteFuncionario(1L);
        //Assert
        Mockito.verify(funcionarioService,Mockito.times(1)).deleteFuncionario(1L);
    }
}