PGDMP         	                x            LaRiveraDelValle    12.3    12.3 :    j           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            k           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            l           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            m           1262    40980    LaRiveraDelValle    DATABASE     �   CREATE DATABASE "LaRiveraDelValle" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Bolivarian Republic of Venezuela.1252' LC_CTYPE = 'Spanish_Bolivarian Republic of Venezuela.1252';
 "   DROP DATABASE "LaRiveraDelValle";
                postgres    false            n           0    0    DATABASE "LaRiveraDelValle"    COMMENT     n   COMMENT ON DATABASE "LaRiveraDelValle" IS 'Base de Datos para aplicación de escritorio La Rivera Del Valle';
                   postgres    false    2925            �            1259    41059    client    TABLE       CREATE TABLE public.client (
    id integer NOT NULL,
    dni character varying(255),
    name character varying(255),
    surname character varying(255),
    phone numeric(19,0),
    email character varying(255),
    direction character varying(255),
    state "char"
);
    DROP TABLE public.client;
       public         heap    postgres    false            �            1259    41001    employee    TABLE     C  CREATE TABLE public.employee (
    id integer NOT NULL,
    "enterpriseId" integer,
    "userEmail" character varying(255),
    dni character varying(19),
    name character varying(255),
    surname character varying(255),
    direction character varying(255),
    phone numeric(19,0),
    job "char",
    state "char"
);
    DROP TABLE public.employee;
       public         heap    postgres    false            �            1259    40986 
   enterprise    TABLE       CREATE TABLE public.enterprise (
    id integer NOT NULL,
    rif character varying(19),
    name character varying(255),
    description character varying(255),
    direction character varying(255),
    phone numeric(19,0),
    email character varying(255),
    state "char"
);
    DROP TABLE public.enterprise;
       public         heap    postgres    false            �            1259    41019    enterpriseBankAccount    TABLE     K  CREATE TABLE public."enterpriseBankAccount" (
    id integer NOT NULL,
    "enterpriseId" integer,
    dni character varying(19),
    name character varying(255),
    bank character varying(255),
    account numeric(25,0),
    amount double precision,
    phone numeric(19,0),
    email character varying(255),
    state "char"
);
 +   DROP TABLE public."enterpriseBankAccount";
       public         heap    postgres    false            �            1259    41044    notification    TABLE     �   CREATE TABLE public.notification (
    id integer NOT NULL,
    message character varying(255),
    type "char",
    state "char"
);
     DROP TABLE public.notification;
       public         heap    postgres    false            �            1259    41041    notificationUser    TABLE     �   CREATE TABLE public."notificationUser" (
    "notificationId" integer,
    "userEmail" character varying(255),
    date date
);
 &   DROP TABLE public."notificationUser";
       public         heap    postgres    false            �            1259    41082    product    TABLE     �   CREATE TABLE public.product (
    id integer NOT NULL,
    name character varying(255),
    description character varying(255),
    type "char",
    quantity integer,
    cost double precision,
    state "char"
);
    DROP TABLE public.product;
       public         heap    postgres    false            �            1259    41104    provider    TABLE     �   CREATE TABLE public.provider (
    id integer NOT NULL,
    name character varying(255),
    description character varying(255),
    phone numeric(19,0),
    direction character varying(255),
    state "char"
);
    DROP TABLE public.provider;
       public         heap    postgres    false            �            1259    41112    providerBankAccount    TABLE     	  CREATE TABLE public."providerBankAccount" (
    id integer NOT NULL,
    "providerId" integer,
    dni character varying(19),
    bank character varying(255),
    account numeric(25,0),
    phone numeric(19,0),
    email character varying(255),
    state "char"
);
 )   DROP TABLE public."providerBankAccount";
       public         heap    postgres    false            �            1259    41130    purchase    TABLE     �   CREATE TABLE public.purchase (
    id integer NOT NULL,
    "employeeId" integer,
    "providerId" integer,
    "accountBank" integer,
    date date,
    subtotal double precision,
    iva double precision,
    total double precision,
    state "char"
);
    DROP TABLE public.purchase;
       public         heap    postgres    false            �            1259    41145    purchaseDetail    TABLE     r   CREATE TABLE public."purchaseDetail" (
    "purchaseId" integer,
    "productId" integer,
    quantity integer
);
 $   DROP TABLE public."purchaseDetail";
       public         heap    postgres    false            �            1259    41067    sale    TABLE     �   CREATE TABLE public.sale (
    id integer NOT NULL,
    "employeeId" integer,
    "clientId" integer,
    "accountBank" integer,
    date date,
    subtotal double precision,
    iva double precision,
    total double precision,
    state "char"
);
    DROP TABLE public.sale;
       public         heap    postgres    false            �            1259    41091 
   saleDetail    TABLE     j   CREATE TABLE public."saleDetail" (
    "saleId" integer,
    "productId" integer,
    quantity integer
);
     DROP TABLE public."saleDetail";
       public         heap    postgres    false            �            1259    40981    user    TABLE     �   CREATE TABLE public."user" (
    id integer,
    email character varying(255) NOT NULL,
    password character varying(16),
    type "char",
    "firstSession" date,
    "lastSession" date,
    "rememberData" "char",
    state "char"
);
    DROP TABLE public."user";
       public         heap    postgres    false            `          0    41059    client 
   TABLE DATA           X   COPY public.client (id, dni, name, surname, phone, email, direction, state) FROM stdin;
    public          postgres    false    208   �I       \          0    41001    employee 
   TABLE DATA           u   COPY public.employee (id, "enterpriseId", "userEmail", dni, name, surname, direction, phone, job, state) FROM stdin;
    public          postgres    false    204   �I       [          0    40986 
   enterprise 
   TABLE DATA           `   COPY public.enterprise (id, rif, name, description, direction, phone, email, state) FROM stdin;
    public          postgres    false    203   YJ       ]          0    41019    enterpriseBankAccount 
   TABLE DATA           |   COPY public."enterpriseBankAccount" (id, "enterpriseId", dni, name, bank, account, amount, phone, email, state) FROM stdin;
    public          postgres    false    205   K       _          0    41044    notification 
   TABLE DATA           @   COPY public.notification (id, message, type, state) FROM stdin;
    public          postgres    false    207   <K       ^          0    41041    notificationUser 
   TABLE DATA           Q   COPY public."notificationUser" ("notificationId", "userEmail", date) FROM stdin;
    public          postgres    false    206   YK       b          0    41082    product 
   TABLE DATA           U   COPY public.product (id, name, description, type, quantity, cost, state) FROM stdin;
    public          postgres    false    210   vK       d          0    41104    provider 
   TABLE DATA           R   COPY public.provider (id, name, description, phone, direction, state) FROM stdin;
    public          postgres    false    212   �K       e          0    41112    providerBankAccount 
   TABLE DATA           j   COPY public."providerBankAccount" (id, "providerId", dni, bank, account, phone, email, state) FROM stdin;
    public          postgres    false    213   �K       f          0    41130    purchase 
   TABLE DATA           t   COPY public.purchase (id, "employeeId", "providerId", "accountBank", date, subtotal, iva, total, state) FROM stdin;
    public          postgres    false    214   �K       g          0    41145    purchaseDetail 
   TABLE DATA           O   COPY public."purchaseDetail" ("purchaseId", "productId", quantity) FROM stdin;
    public          postgres    false    215   �K       a          0    41067    sale 
   TABLE DATA           n   COPY public.sale (id, "employeeId", "clientId", "accountBank", date, subtotal, iva, total, state) FROM stdin;
    public          postgres    false    209   L       c          0    41091 
   saleDetail 
   TABLE DATA           G   COPY public."saleDetail" ("saleId", "productId", quantity) FROM stdin;
    public          postgres    false    211   $L       Z          0    40981    user 
   TABLE DATA           q   COPY public."user" (id, email, password, type, "firstSession", "lastSession", "rememberData", state) FROM stdin;
    public          postgres    false    202   AL       �
           2606    41066    client client_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.client
    ADD CONSTRAINT client_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.client DROP CONSTRAINT client_pkey;
       public            postgres    false    208            �
           2606    41008    employee employee_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.employee DROP CONSTRAINT employee_pkey;
       public            postgres    false    204            �
           2606    41026 0   enterpriseBankAccount enterpriseBankAccount_pkey 
   CONSTRAINT     r   ALTER TABLE ONLY public."enterpriseBankAccount"
    ADD CONSTRAINT "enterpriseBankAccount_pkey" PRIMARY KEY (id);
 ^   ALTER TABLE ONLY public."enterpriseBankAccount" DROP CONSTRAINT "enterpriseBankAccount_pkey";
       public            postgres    false    205            �
           2606    40993    enterprise enterprise_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.enterprise
    ADD CONSTRAINT enterprise_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.enterprise DROP CONSTRAINT enterprise_pkey;
       public            postgres    false    203            �
           2606    41048    notification notification_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.notification
    ADD CONSTRAINT notification_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.notification DROP CONSTRAINT notification_pkey;
       public            postgres    false    207            �
           2606    41089    product product_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.product DROP CONSTRAINT product_pkey;
       public            postgres    false    210            �
           2606    41119 ,   providerBankAccount providerBankAccount_pkey 
   CONSTRAINT     n   ALTER TABLE ONLY public."providerBankAccount"
    ADD CONSTRAINT "providerBankAccount_pkey" PRIMARY KEY (id);
 Z   ALTER TABLE ONLY public."providerBankAccount" DROP CONSTRAINT "providerBankAccount_pkey";
       public            postgres    false    213            �
           2606    41111    provider provider_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.provider
    ADD CONSTRAINT provider_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.provider DROP CONSTRAINT provider_pkey;
       public            postgres    false    212            �
           2606    41134    purchase purchase_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.purchase
    ADD CONSTRAINT purchase_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.purchase DROP CONSTRAINT purchase_pkey;
       public            postgres    false    214            �
           2606    41071    sale sale_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.sale
    ADD CONSTRAINT sale_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.sale DROP CONSTRAINT sale_pkey;
       public            postgres    false    209            �
           2606    40985    user user_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (email);
 :   ALTER TABLE ONLY public."user" DROP CONSTRAINT user_pkey;
       public            postgres    false    202            �
           2606    41077    sale clientId    FK CONSTRAINT     |   ALTER TABLE ONLY public.sale
    ADD CONSTRAINT "clientId" FOREIGN KEY ("clientId") REFERENCES public.client(id) NOT VALID;
 9   ALTER TABLE ONLY public.sale DROP CONSTRAINT "clientId";
       public          postgres    false    2755    209    208            �
           2606    41072    sale employeeId    FK CONSTRAINT     �   ALTER TABLE ONLY public.sale
    ADD CONSTRAINT "employeeId" FOREIGN KEY ("employeeId") REFERENCES public.employee(id) NOT VALID;
 ;   ALTER TABLE ONLY public.sale DROP CONSTRAINT "employeeId";
       public          postgres    false    2749    209    204            �
           2606    41135    purchase employeeId    FK CONSTRAINT     �   ALTER TABLE ONLY public.purchase
    ADD CONSTRAINT "employeeId" FOREIGN KEY ("employeeId") REFERENCES public.employee(id) NOT VALID;
 ?   ALTER TABLE ONLY public.purchase DROP CONSTRAINT "employeeId";
       public          postgres    false    2749    204    214            �
           2606    41009    employee enterpiseId    FK CONSTRAINT     �   ALTER TABLE ONLY public.employee
    ADD CONSTRAINT "enterpiseId" FOREIGN KEY ("enterpriseId") REFERENCES public.enterprise(id) NOT VALID;
 @   ALTER TABLE ONLY public.employee DROP CONSTRAINT "enterpiseId";
       public          postgres    false    2747    203    204            �
           2606    41125 "   enterpriseBankAccount enterpriseId    FK CONSTRAINT     �   ALTER TABLE ONLY public."enterpriseBankAccount"
    ADD CONSTRAINT "enterpriseId" FOREIGN KEY ("enterpriseId") REFERENCES public.enterprise(id) NOT VALID;
 P   ALTER TABLE ONLY public."enterpriseBankAccount" DROP CONSTRAINT "enterpriseId";
       public          postgres    false    203    2747    205            �
           2606    41049    notificationUser notificationId    FK CONSTRAINT     �   ALTER TABLE ONLY public."notificationUser"
    ADD CONSTRAINT "notificationId" FOREIGN KEY ("notificationId") REFERENCES public.notification(id) NOT VALID;
 M   ALTER TABLE ONLY public."notificationUser" DROP CONSTRAINT "notificationId";
       public          postgres    false    2753    207    206            �
           2606    41099    saleDetail productId    FK CONSTRAINT     �   ALTER TABLE ONLY public."saleDetail"
    ADD CONSTRAINT "productId" FOREIGN KEY ("productId") REFERENCES public.product(id) NOT VALID;
 B   ALTER TABLE ONLY public."saleDetail" DROP CONSTRAINT "productId";
       public          postgres    false    210    2759    211            �
           2606    41153    purchaseDetail productId    FK CONSTRAINT     �   ALTER TABLE ONLY public."purchaseDetail"
    ADD CONSTRAINT "productId" FOREIGN KEY ("productId") REFERENCES public.product(id) NOT VALID;
 F   ALTER TABLE ONLY public."purchaseDetail" DROP CONSTRAINT "productId";
       public          postgres    false    2759    210    215            �
           2606    41120    providerBankAccount providerId    FK CONSTRAINT     �   ALTER TABLE ONLY public."providerBankAccount"
    ADD CONSTRAINT "providerId" FOREIGN KEY ("providerId") REFERENCES public.provider(id) NOT VALID;
 L   ALTER TABLE ONLY public."providerBankAccount" DROP CONSTRAINT "providerId";
       public          postgres    false    212    213    2761            �
           2606    41140    purchase providerId    FK CONSTRAINT     �   ALTER TABLE ONLY public.purchase
    ADD CONSTRAINT "providerId" FOREIGN KEY ("providerId") REFERENCES public.provider(id) NOT VALID;
 ?   ALTER TABLE ONLY public.purchase DROP CONSTRAINT "providerId";
       public          postgres    false    214    212    2761            �
           2606    41148    purchaseDetail purchaseId    FK CONSTRAINT     �   ALTER TABLE ONLY public."purchaseDetail"
    ADD CONSTRAINT "purchaseId" FOREIGN KEY ("purchaseId") REFERENCES public.purchase(id) NOT VALID;
 G   ALTER TABLE ONLY public."purchaseDetail" DROP CONSTRAINT "purchaseId";
       public          postgres    false    215    214    2765            �
           2606    41094    saleDetail saleId    FK CONSTRAINT     ~   ALTER TABLE ONLY public."saleDetail"
    ADD CONSTRAINT "saleId" FOREIGN KEY ("saleId") REFERENCES public.sale(id) NOT VALID;
 ?   ALTER TABLE ONLY public."saleDetail" DROP CONSTRAINT "saleId";
       public          postgres    false    211    2757    209            �
           2606    41014    employee userEmail    FK CONSTRAINT     �   ALTER TABLE ONLY public.employee
    ADD CONSTRAINT "userEmail" FOREIGN KEY ("userEmail") REFERENCES public."user"(email) NOT VALID;
 >   ALTER TABLE ONLY public.employee DROP CONSTRAINT "userEmail";
       public          postgres    false    204    2745    202            �
           2606    41054    notificationUser userEmail    FK CONSTRAINT     �   ALTER TABLE ONLY public."notificationUser"
    ADD CONSTRAINT "userEmail" FOREIGN KEY ("userEmail") REFERENCES public."user"(email) NOT VALID;
 H   ALTER TABLE ONLY public."notificationUser" DROP CONSTRAINT "userEmail";
       public          postgres    false    2745    202    206            `      x������ � �      \   �   x��A
�0�?��hC�&�;����q���	$VҚ[	�A/fvf�"E�g�0�����#|��)ҡ֍Ze�ڐ��y)��\���K$�O�����f����b�%o��{g$Y���\��y)>"A�n��(��]�c�U
!�&w/R      [   �   x��A
�0 ��+�5�ڂެ�R<z�&A���|���cFo�2S���*�y]�����	�6G:g����Wt��h����L��x�����G��>VY�8��D3�F�m��P�����,G�\V+Ab��]3��8P{t��*�Ӻ���L8�_�u�KO��h��̲��kD\      ]      x������ � �      _      x������ � �      ^      x������ � �      b      x������ � �      d      x������ � �      e      x������ � �      f      x������ � �      g      x������ � �      a      x������ � �      c      x������ � �      Z   9   x�3��I,�,K-JLI�)K��IuH�M���K���K�hqr�����#W� "5     