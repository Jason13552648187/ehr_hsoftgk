package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocAccount;
import cn.ibizlab.ehr.webapi.dto.SocAccountDTO;
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
    date = "2021-09-04T00:31:44+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SocAccountMappingImpl implements SocAccountMapping {

    @Override
    public SocAccount toDomain(SocAccountDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocAccount socAccount = new SocAccount();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socAccount.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socAccount.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSocaccountname() != null ) {
            socAccount.setSocaccountname( dto.getSocaccountname() );
        }
        if ( dto.getOrmorgid() != null ) {
            socAccount.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getMemo() != null ) {
            socAccount.setMemo( dto.getMemo() );
        }
        if ( dto.getSocaccountid() != null ) {
            socAccount.setSocaccountid( dto.getSocaccountid() );
        }
        if ( dto.getEnable() != null ) {
            socAccount.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            socAccount.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            socAccount.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            socAccount.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            socAccount.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            socAccount.setOrmorgname( dto.getOrmorgname() );
        }

        return socAccount;
    }

    @Override
    public SocAccountDTO toDto(SocAccount entity) {
        if ( entity == null ) {
            return null;
        }

        SocAccountDTO socAccountDTO = new SocAccountDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socAccountDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socAccountDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSocaccountname() != null ) {
            socAccountDTO.setSocaccountname( entity.getSocaccountname() );
        }
        if ( entity.getOrmorgid() != null ) {
            socAccountDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getMemo() != null ) {
            socAccountDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getSocaccountid() != null ) {
            socAccountDTO.setSocaccountid( entity.getSocaccountid() );
        }
        if ( entity.getEnable() != null ) {
            socAccountDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            socAccountDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            socAccountDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            socAccountDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            socAccountDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            socAccountDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return socAccountDTO;
    }

    @Override
    public List<SocAccount> toDomain(List<SocAccountDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocAccount> list = new ArrayList<SocAccount>( dtoList.size() );
        for ( SocAccountDTO socAccountDTO : dtoList ) {
            list.add( toDomain( socAccountDTO ) );
        }

        return list;
    }

    @Override
    public List<SocAccountDTO> toDto(List<SocAccount> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocAccountDTO> list = new ArrayList<SocAccountDTO>( entityList.size() );
        for ( SocAccount socAccount : entityList ) {
            list.add( toDto( socAccount ) );
        }

        return list;
    }
}
