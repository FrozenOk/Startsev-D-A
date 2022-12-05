# -- coding: utf-8 --
#вариант по зачетной книжке 2
def da():
    import requests
    from pprint import pprint
    username = 'spark'
    url = f'https://api.github.com/users/{username}'
    user_data = requests.get(url).json()
    datat = {
        'company': user_data['company'],
    'created_at': user_data['created_at'],
    'email': user_data['email'],
    'id': user_data['id'],
    'name': user_data['name'],
    'url': user_data['url']
    }  
    pprint(datat)
    zapis = open('D:\\sosiska\\Startsev-D-A\\work 11\\data.json', 'w', encoding = 'utf-8')
    zapis.write (str(datat))


da()