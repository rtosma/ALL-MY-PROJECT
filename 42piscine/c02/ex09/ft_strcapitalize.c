/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strcapitalize.c                                 :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: rosma <42kocaeli.com.tr>                   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/07/25 15:07:31 by rosma             #+#    #+#             */
/*   Updated: 2023/07/25 15:20:35 by rosma            ###   ########.tr       */
/*                                                                            */
/* ************************************************************************** */
char	*ft_strlowcase(char *str)
{
	int	k;

	k = 0;
	while (str[k] != '\0')
	{
		if (str[k] >= 'A' && str[k] <= 'Z')
		{
			str[k] += 32;
		}
		k++;
	}
	return (str);
}

char	*ft_strcapitalize(char *str)
{
	int		j;
	int		j1;

	j = 0;
	j1 = 1;
	ft_strlowcase(str);
	while (str[j] != '\0')
	{
		if (str[j] >= 'a' && str[j] <= 'z')
		{
			if (j1 == 1)
			{
				str[j] -= 32;
			}
			j1 = 0;
		}
		else if (str[j] >= '0' && str[j] <= '9')
			j1 = 0;
		else
			j1 = 1;
		j++;
	}
	return (str);
}
