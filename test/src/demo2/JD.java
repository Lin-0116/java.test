package demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 家电实体类
public class JD implements Switch{
    private String name;
    private boolean status;

    @Override
    public void press() {
        status=!status;
    }
}
