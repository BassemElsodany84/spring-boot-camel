package com.soapassion.camel.springbootcamel.processor;

import com.soapassion.camel.springbootcamel.domain.Order;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 * @author bassemelsodany
 */
@Component
public class OrderToCsvProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Order order = exchange.getIn().getBody(Order.class);

        exchange.getOut().setBody("Order is :"+order.toString());
    }
}
