# spigot-chestUI-core

### Usage

step1:<br>
创建InventoryProvider,可以直接使用InventoryProviderImpl

step2:<br>
在InventoryProvider添加你需要的组件:

step3:<br>
注册你的ChestUiHolder

step4:<br>
调用时候直接使用UI.openToPlayer

```java

import com.thesilentnights.chestui.components.impl.ButtonImpl;
import com.thesilentnights.chestui.components.impl.ItemImpl;
import com.thesilentnights.chestui.repo.MenuRepo;
import com.thesilentnights.chestui.service.ChestUIHolder;
import com.thesilentnights.chestui.service.ChestUIHolderImpl;
import com.thesilentnights.chestui.service.InventoryProviderImpl;

public class Example
{
    public void example()
    {
        //step1
        InventoryProviderImpl provider = new InventoryProviderImpl();
        //step2
        provider.addButton(new ButtonImpl());
        provider.addElement(new ItemImpl());
        //step3
        ChestUIHolder holder = new ChestUIHolderImpl(viewer, provider);
        MenuRepo.register(holder);

    }
}



```
