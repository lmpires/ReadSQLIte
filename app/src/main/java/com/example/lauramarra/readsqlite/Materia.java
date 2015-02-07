package com.example.lauramarra.readsqlite;

/**
 * Created by lauramarra on 07/02/15.
 */
public class Materia {
    private int _id;
    private String _codigo, _nome, _periodo, _creditos, _preRequisito1, _preRequisito2, _preRequisito3, _diaSemana;

    public Materia(){}

    public Materia(String codigo,
                   String nome,
                   String periodo,
                   String creditos,
                   String preRequisito1,
                   String preRequisito2,
                   String preRequisito3,
                   String diaSemana) {
        this._codigo = codigo;
        this._nome = nome;
        this._periodo = periodo;
        this._creditos = creditos;
        this._preRequisito1 = preRequisito1;
        this._preRequisito2 = preRequisito2;
        this._preRequisito3 = preRequisito3;
        this._diaSemana = diaSemana;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_codigo(String _codigo) {
        this._codigo = _codigo;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public void set_periodo(String _periodo) {
        this._periodo = _periodo;
    }

    public void set_creditos(String _creditos) {
        this._creditos = _creditos;
    }

    public void set_preRequisito1(String _preRequisito1) {
        this._preRequisito1 = _preRequisito1;
    }

    public void set_preRequisito2(String _preRequisito2) {
        this._preRequisito2 = _preRequisito2;
    }

    public void set_preRequisito3(String _preRequisito3) {
        this._preRequisito3 = _preRequisito3;
    }

    public void set_diaSemana(String _diaSemana) {
        this._diaSemana = _diaSemana;
    }

    public int get_id() {
        return _id;
    }

    public String get_codigo(){
        return _codigo;
    }

    public String get_nome() {
        return _nome;
    }

    public String get_periodo() {
        return _periodo;
    }

    public String get_creditos() {
        return _creditos;
    }

    public String get_preRequisito1() {
        return _preRequisito1;
    }

    public String get_preRequisito2() {
        return _preRequisito2;
    }

    public String get_preRequisito3() {
        return _preRequisito3;
    }

    public String get_diaSemana() {
        return _diaSemana;
    }
}
