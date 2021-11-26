package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmEdition;
import cn.ibizlab.ehr.webapi.dto.OrmEditionDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmEditionMappingImpl implements OrmEditionMapping {

    @Override
    public OrmEdition toDomain(OrmEditionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmEdition ormEdition = new OrmEdition();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormEdition.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormEdition.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOrmeditionname() != null ) {
            ormEdition.setOrmeditionname( dto.getOrmeditionname() );
        }
        if ( dto.getBbh() != null ) {
            ormEdition.setBbh( dto.getBbh() );
        }
        if ( dto.getOrmeditionid() != null ) {
            ormEdition.setOrmeditionid( dto.getOrmeditionid() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormEdition.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormEdition.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            ormEdition.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormEdition.setCreatedate( dto.getCreatedate() );
        }

        return ormEdition;
    }

    @Override
    public OrmEditionDTO toDto(OrmEdition entity) {
        if ( entity == null ) {
            return null;
        }

        OrmEditionDTO ormEditionDTO = new OrmEditionDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormEditionDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormEditionDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOrmeditionname() != null ) {
            ormEditionDTO.setOrmeditionname( entity.getOrmeditionname() );
        }
        if ( entity.getBbh() != null ) {
            ormEditionDTO.setBbh( entity.getBbh() );
        }
        if ( entity.getOrmeditionid() != null ) {
            ormEditionDTO.setOrmeditionid( entity.getOrmeditionid() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormEditionDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormEditionDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            ormEditionDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormEditionDTO.setCreatedate( entity.getCreatedate() );
        }

        return ormEditionDTO;
    }

    @Override
    public List<OrmEdition> toDomain(List<OrmEditionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmEdition> list = new ArrayList<OrmEdition>( dtoList.size() );
        for ( OrmEditionDTO ormEditionDTO : dtoList ) {
            list.add( toDomain( ormEditionDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmEditionDTO> toDto(List<OrmEdition> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmEditionDTO> list = new ArrayList<OrmEditionDTO>( entityList.size() );
        for ( OrmEdition ormEdition : entityList ) {
            list.add( toDto( ormEdition ) );
        }

        return list;
    }
}
