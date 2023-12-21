import org.springframework.stereotype.Service;

@Service
public class SciCalculatorServiceImpl implements SciCalculatorService {

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}