package br.com.alura.screenmatch.service;

public interface IConverteDados {
    //genérico
    <T> T obterDados(String json, Class<T> classe);
}
