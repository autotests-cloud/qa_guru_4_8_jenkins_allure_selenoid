package docs.juniors;

public class Questions {
    void first() {
        // $("ul.repo-list li a").click();
        /*
        <ul class="repo-list">
             <li>
                <a href="">
             </li>
        </ul>
        */

        // $("ul.repo-list.someotherclass li a").click();
        /*
        <ul class="repo-list someotherclass">
             <li>
                <a href="">
             </li>
        </ul>
        */

        // $("ul.repo-list.someotherclass[type=sometype] li a").click();
        /*
        <ul class="repo-list someotherclass" type="sometype">
             <li>
                <a href="">
             </li>
        </ul>
        */

        // Отработает
        // $("ul.repo-list.someotherclass[type=sometype] li a").click();
        /*
        <ul class="repo-list someotherclass" type="sometype">
            <div>
                 <li>
                    <a href="">
                 </li>
             </div
        </ul>
        */

        // Не отработает
        // $("ul.repo-list.someotherclass[type=sometype]>li a").click();
        /*
        <ul class="repo-list someotherclass" type="sometype">
            <div>
                 <li>
                    <a href="">
                 </li>
             </div
        </ul>
        */

        // $("ul.repo-list.someotherclass[type=sometype]").$("li", 2).$("a").click();
        /*
        <ul class="repo-list someotherclass" type="sometype">
             <li>
                <a href="">
             </li>
              <li>
                <a href="">
             </li>
              <li>
                <a href="">
             </li>
        </ul>
        */

        // $("ul.repo-list.someotherclass[type=sometype]").$("li", 2).$("a").click();
        /*
        <ul class="repo-list someotherclass" type="sometype">
             <li>
                <a href="">
             </li>
              <li>
                <a href="">
             </li>
              <li>
                <a href="">
             </li>
        </ul>
        */

//        $("li", 2)
//        $$("li").get(2)

    }
}
