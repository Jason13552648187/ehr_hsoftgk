package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParLdkhqz;
import cn.ibizlab.ehr.webapi.dto.ParLdkhqzDTO;
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
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParLdkhqzMappingImpl implements ParLdkhqzMapping {

    @Override
    public ParLdkhqz toDomain(ParLdkhqzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParLdkhqz parLdkhqz = new ParLdkhqz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parLdkhqz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parLdkhqz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getQzzb() != null ) {
            parLdkhqz.setQzzb( dto.getQzzb() );
        }
        if ( dto.getPfzt() != null ) {
            parLdkhqz.setPfzt( dto.getPfzt() );
        }
        if ( dto.getParldkhqzname() != null ) {
            parLdkhqz.setParldkhqzname( dto.getParldkhqzname() );
        }
        if ( dto.getParkhzcmxid() != null ) {
            parLdkhqz.setParkhzcmxid( dto.getParkhzcmxid() );
        }
        if ( dto.getKhobject() != null ) {
            parLdkhqz.setKhobject( dto.getKhobject() );
        }
        if ( dto.getParldkhqzid() != null ) {
            parLdkhqz.setParldkhqzid( dto.getParldkhqzid() );
        }
        if ( dto.getCreateman() != null ) {
            parLdkhqz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parLdkhqz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            parLdkhqz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parLdkhqz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getParkhzcmxname() != null ) {
            parLdkhqz.setParkhzcmxname( dto.getParkhzcmxname() );
        }
        if ( dto.getKhdx() != null ) {
            parLdkhqz.setKhdx( dto.getKhdx() );
        }

        return parLdkhqz;
    }

    @Override
    public ParLdkhqzDTO toDto(ParLdkhqz entity) {
        if ( entity == null ) {
            return null;
        }

        ParLdkhqzDTO parLdkhqzDTO = new ParLdkhqzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parLdkhqzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parLdkhqzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getQzzb() != null ) {
            parLdkhqzDTO.setQzzb( entity.getQzzb() );
        }
        if ( entity.getPfzt() != null ) {
            parLdkhqzDTO.setPfzt( entity.getPfzt() );
        }
        if ( entity.getParldkhqzname() != null ) {
            parLdkhqzDTO.setParldkhqzname( entity.getParldkhqzname() );
        }
        if ( entity.getParkhzcmxid() != null ) {
            parLdkhqzDTO.setParkhzcmxid( entity.getParkhzcmxid() );
        }
        if ( entity.getKhobject() != null ) {
            parLdkhqzDTO.setKhobject( entity.getKhobject() );
        }
        if ( entity.getParldkhqzid() != null ) {
            parLdkhqzDTO.setParldkhqzid( entity.getParldkhqzid() );
        }
        if ( entity.getCreateman() != null ) {
            parLdkhqzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parLdkhqzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            parLdkhqzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parLdkhqzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getParkhzcmxname() != null ) {
            parLdkhqzDTO.setParkhzcmxname( entity.getParkhzcmxname() );
        }
        if ( entity.getKhdx() != null ) {
            parLdkhqzDTO.setKhdx( entity.getKhdx() );
        }

        return parLdkhqzDTO;
    }

    @Override
    public List<ParLdkhqz> toDomain(List<ParLdkhqzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParLdkhqz> list = new ArrayList<ParLdkhqz>( dtoList.size() );
        for ( ParLdkhqzDTO parLdkhqzDTO : dtoList ) {
            list.add( toDomain( parLdkhqzDTO ) );
        }

        return list;
    }

    @Override
    public List<ParLdkhqzDTO> toDto(List<ParLdkhqz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParLdkhqzDTO> list = new ArrayList<ParLdkhqzDTO>( entityList.size() );
        for ( ParLdkhqz parLdkhqz : entityList ) {
            list.add( toDto( parLdkhqz ) );
        }

        return list;
    }
}
