# گام ۱

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن کلاس پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک کلاس به این نام و پیاده سازی واسط OrderService در آن به شکلی که دو تابع مربوط به تلفن را پیاده سازی میکنیم و توابع دیگر را با بدنه خالی پیاده میکنیم.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفتی</p>
</td>
<td width="292">
<p>افزودن یک تابع برای ثبت سفارش تلفنی با نام phoneOrderRegister که signature اش شبیه به بقیه توابع ثبت سفارش در این واسط است.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع برای پرداخت سفارش تلفنی با نام phoneOrderPayment که signature اش شبیه به بقیه توابع پرداخت سفارش در این واسط است.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت سفارش تلفنی</p>
</td>
<td width="292">
<p>این تابع به علت اضافه شدن آن به واسط که در تغییر قبلی توضیح داده شده است باید در این کلاس هم پیاده سازی شود و ما با بدنه خالی آن را پیاده میکنیم.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>این تابع به علت اضافه شدن آن به واسط که در تغییر قبلی توضیح داده شده است باید در این کلاس هم پیاده سازی شود و ما با بدنه خالی آن را پیاده میکنیم.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت سفارش تلفنی</p>
</td>
<td width="292">
<p>این تابع به علت اضافه شدن آن به واسط که در تغییر قبلی توضیح داده شده است باید در این کلاس هم پیاده سازی شود و ما با بدنه خالی آن را پیاده میکنیم.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۷</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>این تابع به علت اضافه شدن آن به واسط که در تغییر قبلی توضیح داده شده است باید در این کلاس هم پیاده سازی شود و ما با بدنه خالی آن را پیاده میکنیم.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۸</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>چک کردن نحوه انتخاب پرداخت کاربر و ثبت سفارش</p>
</td>
<td width="292">
<p>در سه خط چک میکنیم ابتدا که آیا نحوه پرداخت را کاربر ۳ انتخاب کرده است یا خیر. اگر ۳ انتخاب کرده بود آنگاه یک ابجکت از کلاس PhoneOrderService میسازیم و روی آن رفتار ثبت سفارش را انجام میدهیم.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۹</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>پرداخت سفارش درصورتی که انتخاب کاربر تلفنی باشد.</p>
</td>
<td width="292">
<p>برای این مورد دو خط به این فایل اضافه میکنیم . در خط اول چک میکنیم آیا سفارش ثبت شده باید تلفنی پرداخت شود یا خیر. اگر این شرط پاس شود انگاه رفتار phoreOrderPayment را بر روی ابجکت orderService فراخوانی میکنیم.</p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: ۹

# گام ۲

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p> 
کلاس 
Food
را مورد بررسی قرار میدهیم. در گام اول میتوان گفت که Food تنها یک وظیفه برعهده دارد و آن هم این است که یک فاکتور از غذا ایجاد کند با نام و قیمت آن که بنظرم 
functional cohesion
دارد.

</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
مورد اولی که به ذهنم میرسد این است که در کلاس Main این امکان وجود دارد که در اثر تغییر نیازمندی های actor کاربر نیاز داشته باشیم تا یک غذا به لیست منو اضافه کنیم. از طرف دیگر نیز میتوان این را در نظر گرفت که این امکان وجود دارد که انواع پرداخت ها همانند گام ۲ اکستند شود پس باز هم در جای دیگری از کد  Main ما تغییر خواهیم داشت برای هندل کردن این تغییرات در نتیجه coupling این کلاس با دو کلاس دیگر را مشاهده میکنید و این مورد را مطمئن نیستم.

مورد بعدی واسط OrderService و هر سه کلاسی هستند که این واسط را پیاده سازی میکنند. در این موارد ذکر شده تمامی توابع مربوط به ثبت سفارش و پرداخت آن ها در هر نوعی در هر کدام از انها پیاده سازی شده است و واسط هم مشخصا یک وظیفه ندارد.
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
مورد مشخصی من ندیدم فقط موردی که در Main از واسط OrderService بجای instantiation از concrete class ها استفاده میکنیم سبب میشود که در آن قسمت از کد حتی با گسترش روش های پرداخت باز هم تغییری ایجاد نشود.
منظورم مشخصا جایی است که orderService 
در Main
init
میشود.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
تمام محتویات پکیج PaymentService موارد نقض این اصل هستند. در همین مثالی که در گام اول به عنوان فیچر به پروژه اضافه کردیم توجه کنید. برای اینکه این سیستم پرداخت را گسترش بدهیم مجبور به تغییر کد در Main و تغییر کد در تمام کلاس های روش های پرداخت قبلی شدیم که این مشخصا ناقضه این اصل است.
دیگر مورد نقض این اصل استفاده مستقیم از attribute های کلاس Food در توابع کلاس Order است که این سبب میشود برای توسعه کلاس Food مجبور به تغییر در توابع کلاس های Order شویم.
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
موردی که این اصل را رعایت کرده است init متغیر orderService در main است که باتوجه به ساختار پکیج PaymentService ما توانسته ایم یک نمونه از واسط تولید کنیم و بعد از نمونه ای از subclass را در آن قرار بدیم.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
من این مورد رو نفهمیدم کانسپت این اصل که نقض بشه کلا شی گرایی زیر سوال میرود ولی اینکه به درستی از آن استفاده نشود را در تابع Main
میتوان دید. در این تابع تا جایی که کلاس های مختلف رو نمونه میسازیم و در ابجکت واسط میریزیم همه چی برطبق اصل است تا جایی که instance of میزنیم و تایپ چک میکنیم و تابع های مختلف رو بر روی یک ابجکت فراخوانی میکنیم. 
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
تنها واسطی که ما در این پروژه داریم ناقض این اصل است ولی در موارد ریز تر میتوان گفت که در 
OrderService
و اینکه دو تابع ثبت سفارش و پرداخت سفارش را (برای یکی از انواع) کنار هم داریم یک واسط مینیمال و خوب را ایجاد میکند مورد دیگری که این اصل را محقق کند وجود ندارد. 
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
مورد نقض این اصل بسیار واضح است. چند وظیفه بودن و بیش از حد بزرگ بودن واسط OrderService سبب میشود که هر کدام از کلاس های نحوه سفارش مجبور به پیاده سازی توابعی بشوند که اصلا به انها ربطی ندارد و هیچکاه نیز انها فراخوانی نمیشوند.
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;به عنوان یک attribute نیست ولی از انجایی که استفاده از OrderService به عنوان یک واسط بجای ساختن نمونه از کلاس های مشخص باعث میشود که در رابطه با این instantiation بتوان گفت که بین کلاس Main و OrderService این قاعده مورد استفاده قرار گرفته است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
۱. اولین جایی که نقض میشود کلاس Order است که یک association داره به کلاس Food در حالی که این دو کلاس هر دو concrete هستند و در صورت نیاز به مثلا ایجاد یک کلاس دیگر برای فروش میوه در کلاس Order به مشکل میخوریم. 
۲. بنظرم نمونه سازی از کلاس Order در کلاس Main هم نمونه ای از نقض این مورد است زیرا مشخصا ممکن است در ادامه پروژه نیاز داشته باشیم تا نوع دیگری سفارش را به عنوان یک کلاس مظرح کنیم در صورتی که در اینجا بصورت concrete نمونه ساخته ایم.
</p>
</td>
</tr>
</tbody>
</table>

## راه حل ها

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>SRP</p>
</td>
<td width="246">
<p> تغییری که توسط مشتری تلفنی (actor) درخواست شود روی مشتری آنلاین اثر دارد.</p>
</td>
<td width="284">
<p>تغییرات در توابع هر یک از کلاس‌های پوشه PaymentServices باعث ایجاد تغییر در واسط OrderService و به تبع آن تغییر در سایر کلاس‌ها می‌شود و با اصلاح ساختار OrderService تغییرات ساب‌کلاس‌ها دیگر اثری روی هم نخواهد گذاشت.
</p>
</td>
</tr>
<tr>
<td width="168">
<p>LSP</p>
</td>
<td width="246">
<p>می‌توان یک ساب‌کلاس از OrderService را به عنوان OrderService جایگزین کرد زیرا ممکن است تابعی از OrderService صدا بزنیم که پیاده سازی نشده است و اثر مطلوب را ندارد حتی اگر preconditionها رعایت شود.</p>
</td>
<td width="284">
<p>این اصل در تابع main به دلیل پیاده سازی نادرست رابط OrderService نقض شده بود و در واقع کلاس هایی وجود داشت که نمی‌توانستیم با Parent اش جایگزین شود و برای جلوگیری از خطا در کد main مجبور به استفاده از instanceof بودیم، با بهبود دادن رابط OrderService این مسئله حل می‌شود و instance ایجاد شده نیازی به instanceof برای عملکرد صحیح ندارد.</p>
</td>
</tr>
<tr>
<td width="168">
<p>ISP</p>
</td>
<td width="246">
<p>وجود تعدادی تابع مخصوص هر کدام از subclass ها در واسط</p>
</td>
<td width="284">
<p>دو تابع برای ثبت سفارش و پرداخت بصورت کلی در واسط تعریف میکنیم و در concrete class ها صرفا بدنه این توابع را متفاوت پیاده سازی میکنیم.</p>
</td>
</tr>
<tr>
<td width="168">
<p>DIP, OCP</p>
</td>
<td width="246">
<p>ارتباط دو concrete class که در آینده سبب مشکل در اکستند سیستم میشود.</p>
</td>
<td width="284">
<p>برای این موضوع یک واسط برای کلاس Food تعریف کردیم تا بتوانیم در کلاس Order که 
به این کلاس association داشت از واسط استفاده کنیم. البته این مورد تغییرات  جزئی در کد فعلی نیز نیاز داشت برای مثال هر جا که در هر کلاسی بجز Food به attribute های این کلاس دسترسی داشتند را با استفاده از getter و setter جایگزین کردیم.
</p>
</td>
</tr>
</tbody>
</table>