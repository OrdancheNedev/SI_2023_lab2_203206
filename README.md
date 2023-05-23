Ordanche Nedev 203206






Control Flow Graph


![CFG drawio](https://github.com/OrdancheNedev/SI_2023_lab2_203206/assets/127043099/8f6463c0-f2ae-4319-aacb-14a1bcdb9830)



Cyclomatic complexity 

Цикломатската комплексност ја пресметав според формулата V(G)=E-N+2, каде што E означува број на ребра, а N број на јазли.

N=27

E=35

V(G)=E-N+2=35-27+2=10 

Цикломатската комплексност изнесува 10.





C1 - EveryBranch метода


![EB1](https://github.com/OrdancheNedev/SI_2023_lab2_203206/assets/127043099/cac54daa-8473-44d8-a408-889989025c8e)




![EB2](https://github.com/OrdancheNedev/SI_2023_lab2_203206/assets/127043099/55f5877c-3135-4296-9410-b69acbf4c744)




Првите два случаи тестираат исклучоци, додека останатите ја тестираат програмата во делот со условно гранење.




Multiple Condition


![MultipleCondition](https://github.com/OrdancheNedev/SI_2023_lab2_203206/assets/127043099/ac4883db-3de0-4198-8a6c-248603a63060)


Ако било кој влезен аргумент е null, програмата фрла исклучок. Само ако сите аргументи се различни од null, може програмата да продолжи да се извршува.

