package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmTitle;
import cn.ibizlab.ehr.webapi.dto.OrmTitleDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmTitleMappingImpl implements OrmTitleMapping {

    @Override
    public OrmTitle toDomain(OrmTitleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmTitle ormTitle = new OrmTitle();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormTitle.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormTitle.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTitletype() != null ) {
            ormTitle.setTitletype( dto.getTitletype() );
        }
        if ( dto.getOrmtitlename() != null ) {
            ormTitle.setOrmtitlename( dto.getOrmtitlename() );
        }
        if ( dto.getOrmtitleid() != null ) {
            ormTitle.setOrmtitleid( dto.getOrmtitleid() );
        }
        if ( dto.getCreatedate() != null ) {
            ormTitle.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormTitle.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormTitle.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            ormTitle.setCreateman( dto.getCreateman() );
        }

        return ormTitle;
    }

    @Override
    public OrmTitleDTO toDto(OrmTitle entity) {
        if ( entity == null ) {
            return null;
        }

        OrmTitleDTO ormTitleDTO = new OrmTitleDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormTitleDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormTitleDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTitletype() != null ) {
            ormTitleDTO.setTitletype( entity.getTitletype() );
        }
        if ( entity.getOrmtitlename() != null ) {
            ormTitleDTO.setOrmtitlename( entity.getOrmtitlename() );
        }
        if ( entity.getOrmtitleid() != null ) {
            ormTitleDTO.setOrmtitleid( entity.getOrmtitleid() );
        }
        if ( entity.getCreatedate() != null ) {
            ormTitleDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormTitleDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormTitleDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            ormTitleDTO.setCreateman( entity.getCreateman() );
        }

        return ormTitleDTO;
    }

    @Override
    public List<OrmTitle> toDomain(List<OrmTitleDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmTitle> list = new ArrayList<OrmTitle>( dtoList.size() );
        for ( OrmTitleDTO ormTitleDTO : dtoList ) {
            list.add( toDomain( ormTitleDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmTitleDTO> toDto(List<OrmTitle> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmTitleDTO> list = new ArrayList<OrmTitleDTO>( entityList.size() );
        for ( OrmTitle ormTitle : entityList ) {
            list.add( toDto( ormTitle ) );
        }

        return list;
    }
}
