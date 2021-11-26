package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimLanguageAbility;
import cn.ibizlab.ehr.webapi.dto.PimLanguageAbilityDTO;
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
public class PimLanguageAbilityMappingImpl implements PimLanguageAbilityMapping {

    @Override
    public PimLanguageAbility toDomain(PimLanguageAbilityDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimLanguageAbility pimLanguageAbility = new PimLanguageAbility();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimLanguageAbility.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimLanguageAbility.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getReason() != null ) {
            pimLanguageAbility.setReason( dto.getReason() );
        }
        if ( dto.getJlglbh() != null ) {
            pimLanguageAbility.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getWydjhqsj() != null ) {
            pimLanguageAbility.setWydjhqsj( dto.getWydjhqsj() );
        }
        if ( dto.getFj() != null ) {
            pimLanguageAbility.setFj( dto.getFj() );
        }
        if ( dto.getWyyz() != null ) {
            pimLanguageAbility.setWyyz( dto.getWyyz() );
        }
        if ( dto.getJlczz() != null ) {
            pimLanguageAbility.setJlczz( dto.getJlczz() );
        }
        if ( dto.getBz() != null ) {
            pimLanguageAbility.setBz( dto.getBz() );
        }
        if ( dto.getJlss() != null ) {
            pimLanguageAbility.setJlss( dto.getJlss() );
        }
        if ( dto.getWydj() != null ) {
            pimLanguageAbility.setWydj( dto.getWydj() );
        }
        if ( dto.getPimlanguageabilityname() != null ) {
            pimLanguageAbility.setPimlanguageabilityname( dto.getPimlanguageabilityname() );
        }
        if ( dto.getJlspzt() != null ) {
            pimLanguageAbility.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimLanguageAbility.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPimlanguageabilityid() != null ) {
            pimLanguageAbility.setPimlanguageabilityid( dto.getPimlanguageabilityid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimLanguageAbility.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            pimLanguageAbility.setEnable( dto.getEnable() );
        }
        if ( dto.getSpstate() != null ) {
            pimLanguageAbility.setSpstate( dto.getSpstate() );
        }
        if ( dto.getCreateman() != null ) {
            pimLanguageAbility.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimLanguageAbility.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimLanguageAbility.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgid() != null ) {
            pimLanguageAbility.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimLanguageAbility.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimLanguageAbility.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getYgbh() != null ) {
            pimLanguageAbility.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimLanguageAbility.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimLanguageAbility.setOrmorgid( dto.getOrmorgid() );
        }

        return pimLanguageAbility;
    }

    @Override
    public PimLanguageAbilityDTO toDto(PimLanguageAbility entity) {
        if ( entity == null ) {
            return null;
        }

        PimLanguageAbilityDTO pimLanguageAbilityDTO = new PimLanguageAbilityDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimLanguageAbilityDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimLanguageAbilityDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getReason() != null ) {
            pimLanguageAbilityDTO.setReason( entity.getReason() );
        }
        if ( entity.getJlglbh() != null ) {
            pimLanguageAbilityDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getWydjhqsj() != null ) {
            pimLanguageAbilityDTO.setWydjhqsj( entity.getWydjhqsj() );
        }
        if ( entity.getFj() != null ) {
            pimLanguageAbilityDTO.setFj( entity.getFj() );
        }
        if ( entity.getWyyz() != null ) {
            pimLanguageAbilityDTO.setWyyz( entity.getWyyz() );
        }
        if ( entity.getJlczz() != null ) {
            pimLanguageAbilityDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getBz() != null ) {
            pimLanguageAbilityDTO.setBz( entity.getBz() );
        }
        if ( entity.getJlss() != null ) {
            pimLanguageAbilityDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getWydj() != null ) {
            pimLanguageAbilityDTO.setWydj( entity.getWydj() );
        }
        if ( entity.getPimlanguageabilityname() != null ) {
            pimLanguageAbilityDTO.setPimlanguageabilityname( entity.getPimlanguageabilityname() );
        }
        if ( entity.getJlspzt() != null ) {
            pimLanguageAbilityDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimLanguageAbilityDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPimlanguageabilityid() != null ) {
            pimLanguageAbilityDTO.setPimlanguageabilityid( entity.getPimlanguageabilityid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimLanguageAbilityDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            pimLanguageAbilityDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getSpstate() != null ) {
            pimLanguageAbilityDTO.setSpstate( entity.getSpstate() );
        }
        if ( entity.getCreateman() != null ) {
            pimLanguageAbilityDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimLanguageAbilityDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimLanguageAbilityDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgid() != null ) {
            pimLanguageAbilityDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimLanguageAbilityDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimLanguageAbilityDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getYgbh() != null ) {
            pimLanguageAbilityDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimLanguageAbilityDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimLanguageAbilityDTO.setOrmorgid( entity.getOrmorgid() );
        }

        return pimLanguageAbilityDTO;
    }

    @Override
    public List<PimLanguageAbility> toDomain(List<PimLanguageAbilityDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimLanguageAbility> list = new ArrayList<PimLanguageAbility>( dtoList.size() );
        for ( PimLanguageAbilityDTO pimLanguageAbilityDTO : dtoList ) {
            list.add( toDomain( pimLanguageAbilityDTO ) );
        }

        return list;
    }

    @Override
    public List<PimLanguageAbilityDTO> toDto(List<PimLanguageAbility> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimLanguageAbilityDTO> list = new ArrayList<PimLanguageAbilityDTO>( entityList.size() );
        for ( PimLanguageAbility pimLanguageAbility : entityList ) {
            list.add( toDto( pimLanguageAbility ) );
        }

        return list;
    }
}
