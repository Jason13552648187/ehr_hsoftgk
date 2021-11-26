package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PersonStateMgr;
import cn.ibizlab.ehr.webapi.dto.PersonStateMgrDTO;
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
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PersonStateMgrMappingImpl implements PersonStateMgrMapping {

    @Override
    public PersonStateMgr toDomain(PersonStateMgrDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PersonStateMgr personStateMgr = new PersonStateMgr();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            personStateMgr.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            personStateMgr.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPersonstatemgrname() != null ) {
            personStateMgr.setPersonstatemgrname( dto.getPersonstatemgrname() );
        }
        if ( dto.getOrderno() != null ) {
            personStateMgr.setOrderno( dto.getOrderno() );
        }
        if ( dto.getPersonstatecode() != null ) {
            personStateMgr.setPersonstatecode( dto.getPersonstatecode() );
        }
        if ( dto.getCreatedate() != null ) {
            personStateMgr.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            personStateMgr.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            personStateMgr.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            personStateMgr.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPersonstatemgrid() != null ) {
            personStateMgr.setPersonstatemgrid( dto.getPersonstatemgrid() );
        }

        return personStateMgr;
    }

    @Override
    public PersonStateMgrDTO toDto(PersonStateMgr entity) {
        if ( entity == null ) {
            return null;
        }

        PersonStateMgrDTO personStateMgrDTO = new PersonStateMgrDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            personStateMgrDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            personStateMgrDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPersonstatemgrname() != null ) {
            personStateMgrDTO.setPersonstatemgrname( entity.getPersonstatemgrname() );
        }
        if ( entity.getOrderno() != null ) {
            personStateMgrDTO.setOrderno( entity.getOrderno() );
        }
        if ( entity.getPersonstatecode() != null ) {
            personStateMgrDTO.setPersonstatecode( entity.getPersonstatecode() );
        }
        if ( entity.getCreatedate() != null ) {
            personStateMgrDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            personStateMgrDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            personStateMgrDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            personStateMgrDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPersonstatemgrid() != null ) {
            personStateMgrDTO.setPersonstatemgrid( entity.getPersonstatemgrid() );
        }

        return personStateMgrDTO;
    }

    @Override
    public List<PersonStateMgr> toDomain(List<PersonStateMgrDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PersonStateMgr> list = new ArrayList<PersonStateMgr>( dtoList.size() );
        for ( PersonStateMgrDTO personStateMgrDTO : dtoList ) {
            list.add( toDomain( personStateMgrDTO ) );
        }

        return list;
    }

    @Override
    public List<PersonStateMgrDTO> toDto(List<PersonStateMgr> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PersonStateMgrDTO> list = new ArrayList<PersonStateMgrDTO>( entityList.size() );
        for ( PersonStateMgr personStateMgr : entityList ) {
            list.add( toDto( personStateMgr ) );
        }

        return list;
    }
}
