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

# گام ۴

## ۱
اولین تغییر جدول ساخت خود کلاس سرویس تلفنی است که این بار هم نیاز است. تغییر دوم اضافه کردن توابع مورد نیاز ثبت سفارش تلفنی و پرداختش به واسط OrderService است که این دیگر نیاز نیست. با دلیل مشابه میتوان تغییر ۳ را نیز اعمال نکرد. تغییرات ۴، ۵، ۶ و ۷ نیز دیگر نیاز نیست اعمال شوند. تغییر در تابع main که هندل کننده کل پروسه سفارش گیری اما همچنان نیاز است. پس بدین ترتیب 
۲و ۳و ۴و ۵و ۶و ۷ دیگر این بار مورد استفاده قرار نمیگیرند.
## ۲
این بار تنها به ۳ تغییر نیاز داریم.