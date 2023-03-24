FROM dpage/pgadmin4

COPY ./data/pgadmin4.db /var/lib/pgadmin/pgadmin4.db

USER root
RUN chown pgadmin:root /var/lib/pgadmin/pgadmin4.db
USER pgadmin

ENTRYPOINT ["/entrypoint.sh"]
