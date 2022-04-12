/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineMarcus;

import java.time.LocalDateTime;
import cineMarcus.json.JsonSerializavel;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONObject;


public class Sessao implements JsonSerializavel{
    private Integer id;
    private LocalDateTime data;
    private Integer sala;
    private List<Boolean> assentos;
    private boolean isDub;
    private double preco;
    private Integer filmeId;

    public Sessao(Integer id, LocalDateTime data, Integer sala, List<Boolean> assentos, boolean isDub, double preco, Integer filmeId) {
        this.id = id;
        this.data = data;
        this.sala = sala;
        this.assentos = assentos;
        this.isDub = isDub;
        this.preco = preco;
        this.filmeId = filmeId;
    }
    
    public Sessao(JSONObject json) {
        id = json.getInt("id");
        data = LocalDateTime.parse(json.getString("data"));
        sala = json.getInt("sala");
        assentos = json.getJSONArray("assentos").toList().stream().map(o -> (Boolean) o).collect(Collectors.toList());
        isDub = json.getBoolean("isDub");
        preco = json.getDouble("preco");
        filmeId = json.getInt("filmeId");
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public void setAssentos(List<Boolean> assentos) {
        this.assentos = assentos;
    }

    public void setIsDub(boolean isDub) {
        this.isDub = isDub;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setFilmeId(Integer filmeId) {
        this.filmeId = filmeId;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Integer getSala() {
        return sala;
    }

    public List<Boolean> getAssentos() {
        return assentos;
    }

    public boolean isIsDub() {
        return isDub;
    }

    public double getPreco() {
        return preco;
    }

    public Integer getFilmeId() {
        return filmeId;
    }

    @Override
    public Integer getId() {
        return this.id;
     }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        
        json.put("id", id);
        json.put("data", data.toString());
        json.put("sala", sala);
        json.put("preco", preco);
        json.put("assentos", assentos);
        json.put("filmeId", filmeId);
        json.put("isDub", isDub);
        
        return json;
    }

}