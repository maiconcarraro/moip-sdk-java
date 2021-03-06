package br.com.moip.api;

import br.com.moip.Client;
import br.com.moip.request.OrderRequest;
import br.com.moip.resource.Order;

public class OrderAPI {

    private final Client client;

    public OrderAPI(final Client client) {
        this.client = client;
    }

    public Order create(final OrderRequest order) {
        return client.post("/v2/orders", order, Order.class);
    }

    public Order get(final String id) {
        return client.get("/v2/orders/" + id, Order.class);
    }
}