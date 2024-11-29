package hu.cubix.airport;

import org.springframework.stereotype.Service;

@Service
public class DefaultDiscountService implements DiscountService {
    @Override
    public int getDiscountPercent(int totalPrice) {
        return 10;
    }
}
