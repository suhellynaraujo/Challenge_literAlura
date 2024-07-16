package br.com.alura.challenge_literAlura.service;

public interface IConverteDados {
    <T> T converterDados (String json, Class<T> classe);
}
