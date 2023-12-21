import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator/scientific")
public class SciCalculatorController {

    private final SciCalculatorService sciCalculatorService;

    public SciCalculatorController(SciCalculatorService scientificCalculatorService) {
        this.sciCalculatorService = scientificCalculatorService;
    }

    @GetMapping("/power")
    public double power(@RequestParam double base, @RequestParam double exponent) {
        return sciCalculatorService.power(base, exponent);
    }

    @GetMapping("/square-root")
    public double squareRoot(@RequestParam double number) {
        return sciCalculatorService.squareRoot(number);
    }
}