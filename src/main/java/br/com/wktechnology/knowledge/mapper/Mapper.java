package br.com.wktechnology.knowledge.mapper;

public interface Mapper<T, I> {
    T toModel(I dto);

}
