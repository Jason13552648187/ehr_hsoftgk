package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalStddszn;
import cn.ibizlab.ehr.webapi.dto.SalStddsznDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalStddsznMappingImpl implements SalStddsznMapping {

    @Override
    public SalStddszn toDomain(SalStddsznDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalStddszn salStddszn = new SalStddszn();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salStddszn.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salStddszn.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSfdszn() != null ) {
            salStddszn.setSfdszn( dto.getSfdszn() );
        }
        if ( dto.getSalstddsznname() != null ) {
            salStddszn.setSalstddsznname( dto.getSalstddsznname() );
        }
        if ( dto.getBz() != null ) {
            salStddszn.setBz( dto.getBz() );
        }
        if ( dto.getOrmorgid() != null ) {
            salStddszn.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreatedate() != null ) {
            salStddszn.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salStddszn.setCreateman( dto.getCreateman() );
        }
        if ( dto.getSalstddsznid() != null ) {
            salStddszn.setSalstddsznid( dto.getSalstddsznid() );
        }
        if ( dto.getUpdateman() != null ) {
            salStddszn.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            salStddszn.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            salStddszn.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            salStddszn.setOrmorgname( dto.getOrmorgname() );
        }

        return salStddszn;
    }

    @Override
    public SalStddsznDTO toDto(SalStddszn entity) {
        if ( entity == null ) {
            return null;
        }

        SalStddsznDTO salStddsznDTO = new SalStddsznDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salStddsznDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salStddsznDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSfdszn() != null ) {
            salStddsznDTO.setSfdszn( entity.getSfdszn() );
        }
        if ( entity.getSalstddsznname() != null ) {
            salStddsznDTO.setSalstddsznname( entity.getSalstddsznname() );
        }
        if ( entity.getBz() != null ) {
            salStddsznDTO.setBz( entity.getBz() );
        }
        if ( entity.getOrmorgid() != null ) {
            salStddsznDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreatedate() != null ) {
            salStddsznDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salStddsznDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getSalstddsznid() != null ) {
            salStddsznDTO.setSalstddsznid( entity.getSalstddsznid() );
        }
        if ( entity.getUpdateman() != null ) {
            salStddsznDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            salStddsznDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            salStddsznDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            salStddsznDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salStddsznDTO;
    }

    @Override
    public List<SalStddszn> toDomain(List<SalStddsznDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalStddszn> list = new ArrayList<SalStddszn>( dtoList.size() );
        for ( SalStddsznDTO salStddsznDTO : dtoList ) {
            list.add( toDomain( salStddsznDTO ) );
        }

        return list;
    }

    @Override
    public List<SalStddsznDTO> toDto(List<SalStddszn> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalStddsznDTO> list = new ArrayList<SalStddsznDTO>( entityList.size() );
        for ( SalStddszn salStddszn : entityList ) {
            list.add( toDto( salStddszn ) );
        }

        return list;
    }
}
