/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strlcpy.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: rosma <42kocaeli.com.tr>                   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/07/25 15:23:52 by rosma             #+#    #+#             */
/*   Updated: 2023/07/25 15:26:40 by rosma            ###   ########.tr       */
/*                                                                            */
/* ************************************************************************** */

int	ft_strlen(char *str)
{
	int	k;

	k = 0;
	while (str[k] != '\0')
		k++;
	return (k);
}

unsigned int	ft_strlcpy(char *dest, char *src, unsigned int size)
{
	unsigned int	k;
	unsigned int	j;

	j = ft_strlen(src);
	k = 0;
	if (size != 0)
	{
		while (src [k] != '\0' && k < size - 1)
		{
			dest[k] = src[k];
			k++;
		}
		dest[k] = '\0';
	}
	return (k);
}
